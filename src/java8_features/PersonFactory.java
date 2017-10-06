package java8_features;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
