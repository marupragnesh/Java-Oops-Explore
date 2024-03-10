package java_generics.runningprogram;

interface hey{
        void show();
}
public class strcon<Str1,Str2> {

        Str1 objs1;
        Str2 objs2;

public strcon(Str1 s1,Str2 s2){
        objs1=s1;
        objs2=s2;
        }


        Str1 retu(){
        return objs1;
        }
        Str2 retu1(){
        return objs2;
        }
}
