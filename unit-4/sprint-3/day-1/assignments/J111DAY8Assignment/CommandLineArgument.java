public class CommandLineArgument {
    public static void main(String[] args) {
        System.out.print(args.length);
        if(args.length==1){
            String s=args[0];
            int n=Integer.parseInt(s);
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.print("" +fact+" ");
        }
        else if(args.length==2){
            String s1=args[0];
            String s2=args[1];
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int x=Math.abs(a-b);
            int fact=1;
            for(int i=1;i<=x;i++){
                fact=fact*i;
            }
            System.out.print(fact);
        }else{
            System.out.println("Error");
        }

    }
}
