package demo

abstract class MyAbstract {

    MyService myService
    MyBean myBean

    def doSomething() {
        myService.something(myBean)
    }
}