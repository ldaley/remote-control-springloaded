import com.sun.net.httpserver.HttpServer
import groovyx.remote.transport.http.RemoteControlHttpHandler
import groovyx.remote.server.Receiver

// the receiver of remote commands
def receiver = new Receiver()

// our handler (specific to the httpserver package)
def handler = new RemoteControlHttpHandler(receiver)

def server = HttpServer.create(new InetSocketAddress(9090), 0)
server.createContext("/groovy-remote-control", handler)
server.start()
println "started"