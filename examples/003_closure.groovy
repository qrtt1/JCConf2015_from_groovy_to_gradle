class DelegateDomain {

    def attribute;

    def attr(String attribute) {
        this.attribute = attribute;
    }

}

class ClosureExample {

    def domain = new DelegateDomain()

    def method(Closure closure) {
        return closure.call(this)
    }

    def configure(Closure closure) {
        closure.delegate = domain
        return closure.call()
    }

}

def object = new ClosureExample()
object.method {
    it.domain.attr("set-attr-by-ref")
    println it.domain.attribute
}

object.configure {
    attr("set-attr-by-closure-delegate")
    println attribute
}



