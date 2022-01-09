package com.example.myappdq

import java.util.*

/**
 * @author 啊啊啊
 * @param fjoie
 */
/*  var a:Int=7
    a=8;
    var y=0/0.0
    var t:Long  = a.toLong()
    println("dqdq\n$y")
    //用：“用这个时需要转义字符
    val b="{\"key/\":\"aaaa\"}";
    println("转换后的sting$b")
    println("转化后的类型"+y.javaClass)
    println();
    var h:Char='4';
    var o:Char='5';
    var mm:Short=5;
    mm=(mm-6).toShort();
    println("h-a:${h+1}");
   println("h-a:${h-o}")
    //三种创建数组的方式
    val c= arrayOf(4,"6");
    val d= arrayOfNulls<String>(5);
    d[0]=null
    println("转换后的sting$b"+d[0].toString())
    val e=Array(5){i: Int ->(i*i).toString() }
    val f=Array(5){it*2}
    //it是labamt表达式
    val g=Array(5){100}
var name:String?="lgowaho"
println("h-a:${name?.length}");
println("h:${name?.let {
    println("h-a:${it.length}")
}}");
var jjj="""
        |    \ngeqgqww
        |   哈哈哈哈
        |   给甲方甲方
        |  发几个配角
    """.trimMargin()
var kkk="ghowhgo" +
        "gpjwogjw" +
        "gohwgo/n\ngwg".trim()
println("数字是"+jjj)*/

/*fun main() {
    val shuru = Scanner(System.`in`)
    println(tomoneychinese(shuru.nextDouble()))

}
fun tomoneychinese(num:Double):String {
    var result=""
    val zhengshu:Long= num.toInt().toLong();
    val xiaoshu: Long =Math.round((num-zhengshu)*100)
    val zhengshustring=zhengshu.toString()
    if(zhengshustring.length>=9&&zhengshustring.length<=12){
        result += tozhengshuchinese(zhengshustring.substring(0,4))+"亿"+tozhengshuchinese(zhengshustring.substring(4,8))+"万"+tozhengshuchinese(zhengshustring.substring(8,zhengshustring.length))
    }else if(zhengshustring.length>=5&&zhengshustring.length<=8){
        result += tozhengshuchinese(zhengshustring.substring(0,4))+"万"+tozhengshuchinese(zhengshustring.substring(4,8))
    }else if(zhengshustring.length>=1&&zhengshustring.length<=4){
        tozhengshuchinese(zhengshustring.substring(0,4))
    }
     return result;

}
val hanArr = arrayOf("零","壹","贰","叄","肆","伍","陆","柒","捌","玖")
val unitArr=arrayOf("十","百","千")
fun tozhengshuchinese(zhengshu:String):String{
    var result:String=""
   for (i in 0 until zhengshu.length){
       var num=(zhengshu[i]-48).toInt()
       if(i!=zhengshu.length-1&&num!=0){
           result += hanArr[num]+ unitArr[zhengshu.length-2-i]
       }else{
           result += hanArr[num]
       }
   }
    return result
}*/
/*fun main() {
    var set= setOf<Int>(9,0,5,33,333,33);
    var aa=if(1==1) println("haighai")else println("glglfl")
    println("$aa")
    var list= listOf<Int>(1,8,4,3,32,22)
    list.reduce(){acc, i ->acc+i }

}*/
/*fun method(print: (String),iii:(String)->Int) {
    println("hello world::$print")
    println(iii("fhwaghgi"))
}
fun getint (str:String):Int{
     var str1=str//改变形参，重新赋值
    str1="hgsghosh"
    println("jgosgo")
    return 6;
}*/
/*data class  Result(val result:Int,val str :String)
fun factional(n: Int):Result{
    if(n==1){
        return Result(1,"成功")
    }else if (n>1){
        return Result(factional(n-1).result*n,"成功")
    }else{
        return Result(-1,"参数必须大于0")
    }
}
fun main(args: Array<String>) {
   val aa:Any ="gohaohj";
    //println("ghoajho${aa is Any}");//只要使用is就已经强转型了引用，可以使用没有的方法
    //as强转不安全，as?安全强转，失败返回null
    val bb=aa as? List<Int>;
    bb?.get(0);
    val kekong:String?=null;//可空类型的声明
    //就一个insert就可以改变鼠标光标大小
    kekong?.length//安全调用
    kekong?.let { print("${kekong.length}") }//结合let函数调用
    var a:Int=kekong?.length?:0;
    kekong!!.length;//强制调用
    val metod:(User)->Unit=User::read//自身对象要作为第一个传入
    val aaaa:User= User("goohogh")
    aaaa add (User("gljgohoh"))//infix中缀表达。
    //方法与解构
    //var(name,age)=aaaa;
    //数据类实现返回多个值，和深拷贝
    var(name,age)=aaaa.manyrreturn()
}
public data class shuju constructor(val name:String,val age:Int){

}//val是在数据类中声明了其属性，两个
public class User constructor (a:String){


public lateinit var  name:String
    public var age:Int=0
    public constructor(name:String,age:Int) :this(name){

    }
    //用于返回多个值
    public fun  manyrreturn():shuju{
        return shuju(name,age)
    }
public fun  read(){
    print("${name} have read")
}
    public infix fun add(other:User):User{
        return User(name+other.name)
    }
    operator fun component1():String{
        return name;
    }
    operator fun component2():Int{
        return age;
    }
}*/
//super<>来限定父类，接口类型，调用同名方法
//is判断再转型。不是会产生编译错误。
//as,as？第一个会产生错误，第二个会返回null。
//密封类，scaled，其实是抽象类，只是子类必须固定。
//kotlin没有匿名函数，但是又对象表达式，可以有多个父类。
//object :fulei1,fulei2{}
fun main() {

val test={
    print("hgogo")
    1
}
}

