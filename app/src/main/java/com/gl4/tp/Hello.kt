package com.gl4.tp

import kotlin.math.abs
fun distance(p:Point,q:Point):Int = abs(p.x - q.x) + abs(p.y -q.y)

data class Point(var x: Int, var y: Int){
}
open class Rectangle (var p: Point =Point(0,0),var q: Point =Point(1,1), )
{
    override fun toString(): String = "p=$p q=$q"
    fun surface() : Int {
        var c: Point = Point(p.x,q.y);
        var h = distance(c,q);
        var l= distance(c,p);
        return h*l
    }
}

fun main(args: Array<String>) {
    var a = Point(3, 0)
    var b = Point(2, 2)
    var A = Rectangle()
    var B = Rectangle(a)
    var C = Rectangle(q = b)
    var D = Rectangle(a, b)
    var rectangles = listOf(A, B, C, D)
    for (i in 0..rectangles.size-1) {
        println(rectangles[i].toString());
        var surface = rectangles[i].surface()
        println("Surface : $surface")

    }
}



