import thriftpy
from thriftpy.rpc import make_server
import math

sv_thrift = thriftpy.load('service.thrift', module_name='sv_thrift')

class Dispatcher:
    def ping(self, x):
        return 'Ping~{0}'.format(math.exp(x))

ip = '127.0.0.1'
port = 6666
server = make_server(sv_thrift.Ping, Dispatcher(), ip, port)
server.serve()

