// package ;

import java.util.Collection;

public abstract static class StringManipulation {

    public static String listToListString(List<Object> elements) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(Object element: elements) {
            builder.append(element.toString()).append(",");
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }

    public static String collectionToCollectionString(Collection<Object> collection, String delimiter) {
        StringBuffer buffer = new StringBuffer();
        for (Object item: collection) {
            buffer.append(item).append(delimiter);
        }
        buffer.deleteCharAt(buffer.length() - 1);
        return buffer.toString();
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }


}