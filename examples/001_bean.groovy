class Bean {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

def bean = new Bean();
bean.setName("hello gradle");
println bean.getName();
