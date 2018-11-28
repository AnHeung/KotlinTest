fun<T> append(dest : MutableList<in T> , des : List<out T>){
        dest.addAll(des)
}