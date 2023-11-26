package com.example.my_kotlin

class Demo1 {
}

const val PI = 3.1415 //定义编译时常量，不能作为局部变量，只能定义在函数之外(编译时)。

//fun main() {
//    // 内置数据类型：String、Char、Boolean、Int、Double、List、Set(无重复的元素集合)、Map
//
//    // var可读可改。
//    var name:String = "张三"// 这里的Sting是灰色的，Kotlin会自动推断出值的类型，所以可省略。
//    name = "李四"
//    var username = "王五"
//    var age =90
//
//    // val只可读，不可改。
//   val wamaInfo = "王麻子 信息。"// 只读类型的变量
//
//    println("Hello World! My name is $name, $username,$age 岁。$wamaInfo, π是$PI")
//
//    //TODO range表达式
//    val number = 143
//    if (number in 0..59) {
//        println("不及格。")
//    } else if (number in 60..80) {
//        println("良好。")
//    } else if (number in 81..100) {
//        println("优秀。")
//    } else if (number !in 0..100) {
//        println("分数不在范围内。。")
//    }
//
//    //TODO when表达式
//    val week = 5
//    val weekInfo = when(week) {
//        1-> "周一，约会。"
//        2-> "周二，看电影。"
//        3-> "周三，吃饭。"
//        4-> "周四，打球。"
//        5-> "周五，打游戏。"
//        6-> "周六，加班。"
//        7-> "周七，加夜班。"
//       else -> {
//           println("种田养猪。。")
//       }
//    }
//    println("一天天干了啥--$weekInfo")
//
//}

////TODO Kotlin语音的String模版
//fun main(){
//    val garden = "zoom公园"
//    val time = 6
//    println("今天天气好晴朗，去$garden")//后面不再接字符串
//    println("今天天气好晴朗，去$garden，玩了$time 小时")//后面不再接字符串
//    println("今天天气好晴朗，去$garden 玩，玩了$time 小时")//后面继续拼接字符串用{}做隔离
//    println("今天天气好晴朗，去${garden}玩，玩了${time}小时")//后面继续拼接字符串用{}做隔离
//
//    //Kotlin的if是表达式，可以更灵活；Java的if是语句，有点局限。
//    val isLogin = true
//    println("服务响应结果:${if (isLogin)"登录成功！" else "登录失败！"}")
//}

////TODO Kotlin的函数头
//private fun method01(age:Int,name:String): Int {//默认是public，这里声明为private
//    // java语言：private static final int method01(int age,String name){
//    println("你的姓名是：$name,你的年龄是：$age")
//    return 200
//}

////TODO Kotlin的函数参数的默认参数
//fun main(){
//    action01(89,"李四")
//    action02(19)
//    action03()
//    action03(76,"赵六")
//}
//private fun action01(age:Int,name:String){
//    println("你的姓名是：$name,你的年龄是：$age")
//}
//private fun action02(age:Int,name:String = "张三"){
//    println("你的姓名是：$name,你的年龄是：$age")
//}
//private fun action03(age:Int = 80,name:String = "王五"){
//    println("你的姓名是：$name,你的年龄是：$age")
//}

////TODO Kotlin的具名函数参数
//fun main(){
//    loginAction(age=18,address="瑞金",phoneNumber="1332323",username="李四",userPwd = "123")
//}
//
//private fun loginAction(username:String,userPwd:String,phoneNumber:String,age:Int,address:String){
//    println("username：$username,userPwd：$userPwd,phoneNumber：$phoneNumber,age：$age,address：$address")
//}

////TODO Kotlin的Unit函数特点
//// Java语言的void关键字（无参数返回的忽略类型），但void是关键字不是类型。
//// Unit不写，默认也有。Unit代表无参数返回的忽略类型 == Unit类型类；Unit类
//private fun doWork() : Unit{
//}

////TODO Kotlin的Nothing类型特点
//fun main(){
//    show(-1)
//}
//
//private fun show(number:Int) {
//    when(number) {
//        -1 -> TODO("没有这种分数")//Nothing：控制台抛异常打印，提示没有这种分数
//        in 0..59 ->println("$number 分数不及格")
//        in 60..80 ->println("$number 良好")
//        in 81..100 ->println("$number 优秀")
//    }
//}
//interface A { fun show()}
//
//class AImpl : A {
//    //Nothing： 下面这句不是注释提示，会终止程序，提示not implemented.类似上面的TODO("没有这种分数")
//    override fun show() {
//        TODO("Not yet implemented")
//    }
//}

////TODO Kotlin的反引号中函数名特点（这个字符：``）
//fun main(){
//    // 第一种情况：
//    `登录功能 2021年11月26日开发环境，开发人HaHa`("李四","123456")
//
//    // 第二种情况：调用java代码的函数名is\in刚好是Kotlin的关键字
//    KtBase.`is`()
//    KtBase.`in`()
//
//    // 第三种情况：//防反编译。公司加密私有文档里写着：235267863252===此函数的作用 xxxxx
//    `235267863252`()
//}
//
//private fun `登录功能 2021年11月26日开发环境，开发人HaHa`(name:String, pwd:String) {
//    println("模拟：用户名是$name,密码是$pwd")
//}
//
//private fun `235267863252`(){
//    //写了很复杂的功能，核心功能
//    //...
//}


















