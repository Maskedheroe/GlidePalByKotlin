# GlidePalByKotlin
A util for using Glide easily, made it by kotlin

[![](https://jitpack.io/v/Maskedheroe/GlidePalByKotlin.svg)](https://jitpack.io/#Maskedheroe/GlidePalByKotlin)

USE IT !
===

```Add it in your root build.gradle at the end of repositories:
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
 
THEN :
 Add the dependency
 dependencies {
	       implementation 'com.github.Maskedheroe:GlidePalByKotlin:v3.0.3'
}
```
You can easy load
===

```
   GlidepalUtil.getInstance().simpleLoad(context,"url",imageView)
   
   GlidepalUtil.getInstance().simpleLoad(context,R.drawable.source,imageView)
```

You can set options
===

```
    GlidepalUtil.getInstance()
    .setOptions()
    .glideLoad()

  
```
