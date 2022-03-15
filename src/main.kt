fun main (){
    var output=multipleArray(arrayOf(30,50,70,100))
    println(output)
    var result=sumintegers(arrayOf("I am 9.0,53 kenya 15.22"))
    println(result)
    var feedback=name(arrayOf('a','o','t','n','i','u'))
    println(feedback)
}


fun multipleArray(numbers:Array<Int>):Int{
    var multiple=1
    numbers.forEach{number->
        multiple *=number

    }
    return multiple

}
fun sumintegers(mixedArray:Array<Any>):Double{
    var add=0.0
    mixedArray.forEach {num->
        if(num is Double)
       add+=num
    }
    return add
}
fun name(sentence:Array<Char>):Int{
    var y=0
    sentence.forEach{vowel->
        if(vowel=='a' ||vowel=='o' ||vowel=='t' ||vowel=='n' ||vowel=='i' ||vowel=='u')
            y++

    }
    return y


}





















