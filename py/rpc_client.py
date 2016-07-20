import thriftpy
from thriftpy.rpc import make_client

sv_thrift = thriftpy.load('service.thrift', module_name='sv_thrift')

ip = '127.0.0.1'
port = 6666
client = make_client(sv_thrift.Ping, ip, port)

# Call Target Function
z = client.ping(3.14)
print(z)
client.close()
