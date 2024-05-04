package com.fxytb.malltinyboot.lombok.example;

import lombok.Getter;
import lombok.Setter;
import lombok.val;

@Getter
@Setter
public class GetterSetterExample {

    private String name;

    public static void main(String[] args) {

        val getterSetterExample = new GetterSetterExample();
        getterSetterExample.setName("21312y");
        System.out.println(getterSetterExample.getName());

    }

}
