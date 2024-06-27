class A {
  public int fun() {
    int x = 1;
        
<<<<<<< samples/list_conflict/left.java
    x = x + 1;
    x = x + 1;
=======
    x = x + 2;
    x = x + 2;
>>>>>>> samples/list_conflict/right.java

    return x;
  }
}
