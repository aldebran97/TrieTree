# AC自动机

AC = TrieTree + KMP

（1）ac.com.aldebran.AC 不支持包含词的AC自动机

（2）ac.com.aldebran.ACPlus 支持包含词的AC自动机

# 用途

### （1）海量词库检索

用法

```java
AC trieTree=new AC();
trieTree.addWords(Arrays.asList("word1","word2","word3"));
trieTree.update();
System.out.println(trieTree.indexOf("001word1002word0003word2"));
```

### （2）文本检索，相似检索

插入查询用法

```java
// 构造
TextSimilaritySearch textSimilaritySearch = new TextSimilaritySearch("test", 1, 1, 0.5, 2, 0.1, 5);

// 插入文本
textSimilaritySearch.addText("伊凡一世  莫斯科大公（约1325年－1340年3月31日在位）", "伊凡一世", "1", 0.5);
textSimilaritySearch.addText("水调歌头 水调歌头，词牌名。亦称《花犯念奴》、《元会曲》。", "水调歌头", "2", 0.5);

// 相似查询
System.out.println(textSimilaritySearch.similaritySearch("伊凡二世 水调歌头", 10));
```

库的保存和加载

```java
// load
TextSimilaritySearch textSimilaritySearch=TextSimilaritySearch.load(inFile);
// save
TextSimilaritySearch.save(outFile);
```

### （3）空间效率统计

170909个短文本(200-600 chars)，磁盘空间占用1.04GB

### （4）时间效率统计

#### AC词库匹配时间

```text
词库词数 3311072
输入文本长度 38chars
词库匹配所需时间 0.4ms
```

#### 相似搜索时间
```text
170909个短文本
相似搜索所需时间 0.51s
```


#### 加载时间（程序启动时候，只需要一次）
```text
170909个短文本
加载所需时间46.902s
```


（5）注意事项

当文章非常多的时候，要指定很大的Xss和Xms，例如：
-Xss1024m -Xms5g

（6）TODO

数字还需要支持精确匹配
相似检索 title match 利用AC加速，进一步提升速度