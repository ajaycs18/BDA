val wordFile = sc.textFile("input.txt")

val wordCounts = wordFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey((a, b) => a + b).collect()

for ((k, v) <- wordCounts) {
  if (v > 4) println(k + ": " + v)
}

