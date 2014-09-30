// Place your Spring DSL code here
beans = {
    myBeanImpl demo.MySpecificBeanImpl

    myConcrete(demo.MyConcrete) { bean ->
        bean.autowire = true
        myBean = ref('myBeanImpl')
    }
}
