public class User {
    private Integer age;
    private String  name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0 || age > 100 ) {
          throw new ilegalAgeException("Возраст " +
                  "не может быть меньше или больше 100." +
                  "А вы задали " + age);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws illegalNamelentghException {
        if (name.length() > 20){
            throw new illegalNamelentghException("Длина имени недолжно " +
                    "быть больше 20 символов. А вы ввели" + name);
        }
        this.name = name;
    }
}
