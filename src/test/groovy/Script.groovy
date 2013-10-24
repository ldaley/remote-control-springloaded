import groovyx.remote.client.RemoteControl
import groovyx.remote.transport.http.HttpTransport

def transport = new HttpTransport("http://localhost:9090/groovy-remote-control")
def remote = new RemoteControl(transport)
assert remote.exec { 1 + 1 } == 2
