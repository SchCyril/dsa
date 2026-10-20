
/*

    hashtable = A data structure that stores unique keys to values ex.<Integer, String>
                Each key / value pair is known as an Entry
                Fast insertion, look up, deletion of key/value pairs
                Not Ideal for small datasets, great with large data sets

    Hashing = takes a key and computes an integer ( formula will vary based on key & data type)
              in a Hashtable, we use the hash % capacity to calculate an index number


              key.hashCode() % capacity = index

    Bucket = An indexed storage location for one or more Entries
             can store multiple Entries in case of collision ( linked similarly a LinkesList)

    Collision = Hash function generates the same index for more than one key
                Less collisions ) more efficiency

    Runtime complexity : Best Case O(1)
                         Worst Case O(n)

 */

void main() {

    Hashtable<String, String> table = new Hashtable<>(10);

    table.put("100", "Spongebob");
    table.put("123", "Patrick");
    table.put("321", "Sandy");
    table.put("555", "Squidward");
    table.put("777", "Gary");

    for (String key : table.keySet()) {
        System.out.println(key.hashCode() % 10  + "\t" + key + "\t" + table.get(key));
    }



}