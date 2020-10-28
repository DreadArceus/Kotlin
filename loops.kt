import java.util.Scanner

fun main()
{
    var inp = Scanner(System.`in`)
    var x:Int = inp.nextInt()
    for(i in 1..x step 3)
    {
        print(i)
        print(" ")
        if(i % 10 == 0)
        {
            print("\n")
        }
    }
}