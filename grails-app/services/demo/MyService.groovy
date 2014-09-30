package demo

class MyService {

    def something(MyBean bean) {
        "Bean class name is ${bean.class.name} in MyService.something() method"
    }
    def somethingElse(MyBean bean) {
        "Bean class name is ${bean.class.name} in MyService.somethingElse() method"
    }
}
