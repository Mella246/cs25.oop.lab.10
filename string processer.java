public void processStrings(List<String> list, Predicate<String> filter, 
                           Function<String, String> mapper, Consumer<String> consumer) {
    list.stream()
        .filter(filter)
        .map(mapper)
        .forEach(consumer);
}
public void processStrings(List<String> list, Predicate<String> filter, 
                           Function<String, String> mapper, Consumer<String> consumer) {
    list.stream()
        .filter(filter)
        .map(mapper)
        .forEach(consumer);
}
