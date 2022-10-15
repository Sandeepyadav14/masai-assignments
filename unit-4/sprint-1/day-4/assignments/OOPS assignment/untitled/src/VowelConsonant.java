public class VowelConsonant {

    void CheckCharacter(String c){
        if(c=="a" ||c=="e"  ||c=="i"  ||c=="o"  ||c=="u" ){
            System.out.println(c+" is vowel");
        }
         else if (c=="b" ||c=="c"  ||c=="d"  ||c=="f"  ||c=="g" ||c=="h" ||c=="j"  ||c=="k"  ||c=="l"  ||c=="m" ||c=="n" ||c=="p"  ||c=="q"  ||c=="r"  ||c=="r" || c=="s" ||c=="t"  ||c=="v"  ||c=="w"  ||c=="x"|| c=="y" ||c=="z"){
            System.out.println(c+" is Consonant");
        }
        else{
            System.out.println(c+" is Invalid Character");
        }
    }
    public  static  void main(String[] args){
        VowelConsonant str=new VowelConsonant();
        String c="a";
        str.CheckCharacter(c);
        String d="b";
        str.CheckCharacter(d);
        String e="@";
        str.CheckCharacter(e);
    }
}
