package demo

class DemoController {
    def myConcrete
    def index() {
        def sb = new StringBuffer()
        sb << myConcrete.doSomething()
        sb << " and "
        sb << myConcrete.doSomethingElse()
        render sb
    }
}
