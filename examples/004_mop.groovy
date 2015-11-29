// example from
// http://www.ibm.com/developerworks/library/j-pg09205/index.html
class MOPHandler {

    def invokeMethod(String method, Object params) {
        println "MOPHandler was asked to invoke ${method}"
        if(params != null){
            params.each{ println "\twith parameter ${it}" }
        }
    }

    def getProperty(String property){
        println "MOPHandler was asked for property ${property}"
    }

}

def hndler = new MOPHandler()
hndler.helloWorld()
hndler.createUser("Joe", 18, new Date())
hndler.name
