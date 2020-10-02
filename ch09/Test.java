/**
 * 9.1 Explores Java types.
 * @author ivorgilmartin
 */
public class Test {

    public static void main(String[] args) {

        // 9.1.1
        String str = "string";
        char ch ='c';
        int i = 1;
        double d = 2.0;
        boolean bool = true;

        System.out.println(str + "...");// string
        System.out.println(str + ch);	// string
        System.out.println(str + i);	// string
        System.out.println(str + d);	// string
        System.out.println(str + bool);	// string
        System.out.println(str + str);	// string
        System.out.println();

        System.out.println(ch + "...");	// string
        System.out.println(ch + str);	// string
        System.out.println(ch + i);		// int
        System.out.println(ch + d);		// double
        //System.out.println(ch + bool);// + operator is undefined for the argument type(s) char, boolean
        System.out.println(ch + ch);	// int
        System.out.println();

        System.out.println(i + "...");	// string
        System.out.println(i + str);	// string
        System.out.println(i + ch);		// int
        System.out.println(i + d);		// double
        //System.out.println(i + bool);	// + operator is undefined for the argument type(s) int, boolean
        System.out.println(i + i);		// int		
        System.out.println();

        System.out.println(bool + "...");// string
        System.out.println(bool + str);	// string
        //System.out.println(bool + ch);// + operator is undefined for the argument type(s) boolean, char
        //System.out.println(bool + i);	// + operator is undefined for the argument type(s) boolean, int
        //System.out.println(bool + d);	// + operator is undefined for the argument type(s) boolean, double
        //System.out.println(bool + bool);// + operator is undefined for the argument type(s) boolean, boolean
        System.out.println();


        // 9.1.4
        char x = ch;
        //x = x + 1; // type mismatch cannot convert from int to char 
        //int one = 1;
        //x = x + one; // type mismatch cannot convert from int to char
        System.out.println(x);// c
        x++;// incremented by a "code unit"
        System.out.println(x);// d
        System.out.println();


        // 9.1.5
        String empty = "";
        System.out.println(empty + "...");// string
        System.out.println(empty + ch);	// string
        System.out.println(empty + i);	// string
        System.out.println(empty + d);	// string
        System.out.println(empty + bool);	// string
        System.out.println(empty + str);	// string
        System.out.println();


        // 9.1.6
        String s = "another string";
        System.out.println(s);
        //s = ch;	// type mismatch cannot convert from char to String 
        //s = i;	// type mismatch cannot convert from int to String 
        //s = d;	// type mismatch cannot convert from double to String 
        //s = bool;// type mismatch cannot convert from boolean to String 
        s = s;
        System.out.println();
        char c = 'h';
        System.out.println(c);
        //c = s;	// type mismatch cannot convert from String to char 
        //c = i;	// type mismatch cannot convert from int to char 
        //c = d;	// type mismatch cannot convert from double to char 
        //c = bool;// type mismatch cannot convert from boolean to char 
        System.out.println();
        int in = 11;
        System.out.println(in);
        //in = s;	// type mismatch cannot convert from String to int 
        in = c;	
        System.out.println(in);// 100 
        //in = d;	// type mismatch cannot convert from double to int 
        //in = bool;// type mismatch cannot convert from boolean to int
        System.out.println();
        double dd = 22.0;
        System.out.println(dd);// 22.0
        //dd = s;	// type mismatch cannot convert from String to double
        dd = ch;
        System.out.println(dd);// 99.0
        dd = i;
        System.out.println(dd);// 1.0
        //dd = bool;// type mismatch cannot convert from boolean to double
        System.out.println();
        boolean boole = false;
        System.out.println(boole);
        //boole = s;// type mismatch cannot convert from String to boolean 
        //boole = ch;	// type mismatch cannot convert from char to boolean 
        //boole = i;	// type mismatch cannot convert from int to boolean 
        //boole = 0;	// type mismatch cannot convert from int to boolean 
        //boole = d;	// type mismatch cannot convert from double to boolean 
        boole = bool;
        System.out.println(boole);

    }

}
