package chapter07{

  import chapter07.test01.person
  //包内可以嵌套包（通常不超过3层嵌套）
  //子包的类可以直接调用父包的类
  //但是父包的类调用子包的类需要import引用该包，import调用包可以用绝对路径和相对路径
  class car{
    var car_name="小花"
    var person=new person
  }
  package test01{
    class person{
      var name="zhangsan"
      var age=10
      var car1:car=new car
      var dog=new dog
    }
  }
  package test02{
    class person{
      var age=20
    }
  }
}

