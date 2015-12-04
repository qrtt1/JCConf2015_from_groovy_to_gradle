class Bean {
    String name;
    String someVar;

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public String getValue() { return someVar; }
    public void setValue(String value) { this.someVar = value; }

}

def bean = new Bean();
bean.setName("hello gradle");
println bean.getName();

bean.value = "123";
println bean.value
