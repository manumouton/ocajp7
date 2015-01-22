package eu.manumouton.ocaj.chapter2;

/**
 * Created by manu on 2/12/14.
 */
public class Chapter2 {

    private enum MyEnum{VALUE1, VALUE2};

    public static void main(String args[]){
        MyEnum en = MyEnum.VALUE1;

        switch(en){
            case VALUE1:
                break;
            case VALUE2:
                break;
        }
    }
}
