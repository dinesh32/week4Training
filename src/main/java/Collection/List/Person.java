/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Dinesh
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private Integer age;
    private String address;
    private String phoneNumber;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber=" + phoneNumber + '}';
    }
    

    

}
