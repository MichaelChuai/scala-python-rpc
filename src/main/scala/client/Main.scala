package client

/**
  * Created by michael on 7/20/16.
  */


import org.apache.thrift.transport.TTransport
import org.apache.thrift.transport.TSocket
import org.apache.thrift.protocol.{TBinaryProtocol, TProtocol}

import gen.Ping

object Main {
  def main(args: Array[String]): Unit = {
    val ip = "127.0.0.1"
    val port = 6666

    val transport: TTransport = new TSocket(ip, port)
    transport.open()

    val protocol: TProtocol = new TBinaryProtocol(transport)
    val client: Ping.Client = new Ping.Client(protocol)

    // Call Target Function
    val z = client.ping(3.14)
    println(s"The result is: $z")

    transport.close()
  }
}











