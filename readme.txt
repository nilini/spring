Spring框架通过反射根据<bean../>元素的class属性指定的类名创建了一个Java对象，并以<bean.../>元素的id属性的值为key,
将该对象放入Spring容器中---这个Java对象就成为了Spring容器中的Bean。 个