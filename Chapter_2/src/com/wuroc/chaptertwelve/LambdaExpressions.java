package com.wuroc.chaptertwelve;

/**
 * https://github.com/WuRoc
 *  1. 参数。
 *  2. 接着 ->，可视为“产出”。
 *  3. -> 之后的内容都是方法体。
 *
 * (页码339).
 * @author WuRoc
 * @create 2020-10-10 15:48
 */
interface Description {
    String myGitHub = "https://github.com/WuRoc";
    String brief();
}
interface Body {
    String detailed(String head);
}
interface Multi {
    String twoArg(String head, Double d);
}
public class LambdaExpressions {
    //具有行为的对象传给方法
    static Body bod = h -> h + " No Parens!";       //当只用一个参数，可以不需要括号 ()。然而，这是一个特例。
    static Body bod2 = (h) -> h + " More details";  //正常情况使用括号 () 包裹参数。为了保持一致性，也可以使用括号 () 包裹单个参数，虽然 这种情况并不常见。
    static Description desc = () -> " Short info";   //如果没有参数，则必须使用括号 () 表示空参数列表。
    static Multi mult = (h, n) -> h + n;            //对于多个参数，将参数列表放在括号 () 中。
    static Description moreLines = () -> {
        System.out.println("moreLines()");
        //由于lambda方法体都是单行，如果在 Lambda 表达式中确实需要多行，则必须将这些行放在花括号中。在这种情况下，就需 要使用 return。
        return "from moreLines()";
    };
    public static void main(String[] args){
        System.out.println(bod.detailed("OH!"));
        System.out.println(bod2.detailed("Hi! Wu"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi! ", 3.14159));
        System.out.println(moreLines.brief());
    }
}


      /*  OH! No Parens!
        Hi! Wu More details
        Short info
        Pi! 3.14159
        moreLines()
        from moreLines()*/