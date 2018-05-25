package com.example.fangxy.glidepalbykotlin

import android.content.Context
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import java.security.CodeSource

/* Glide 加载 简单判空封装 防止异步加载数据时调用Glide 抛出异常

 @param context
 @param url           加载图片的url地址  String
 @param imageView     加载图片的ImageView 控件
 @param default_image 图片展示出现错误的本地图片 id


 private String TAG = "ImageLoader";*/

class GlidepalUtil private constructor() {

    private val TAG: String = "Your PictureLoader"

    private var requestOptions :RequestOptions? = null
    /*懒汉加载模式，保证线程安全*/
    public var value: GlidepalUtil? = null

    private object mHolder {
        val INSTANCE = GlidepalUtil()
    }

    companion object Factory {
        fun getInstance(): GlidepalUtil {
            return mHolder.INSTANCE;
        }
    }


    /*
    * @author
    * @doc annotation
    * @add yours
    *
    * This is your options with transforms!
    * You should use ENUM to choose your transform
    * @FOR THE DOWN
    */

    public fun setOptions(defaultPic : Int,erroPic : Int, transForms: TransForms ):GlidepalUtil{
        when(transForms){
            TransForms.CENTERCROP ->{
                val requestoptions : RequestOptions = RequestOptions()
                        .placeholder(defaultPic)
                        .error(erroPic)
                        .centerCrop()
                requestOptions = requestoptions
            }
            TransForms.FITCNTER ->{
                val requestoptions : RequestOptions = RequestOptions()
                        .placeholder(defaultPic)
                        .error(erroPic)
                        .fitCenter()
                requestOptions = requestoptions
            }
            TransForms.CIRCLECROP ->{
                val requestoptions : RequestOptions = RequestOptions()
                        .placeholder(defaultPic)
                        .error(erroPic)
                        .circleCrop()
                requestOptions = requestoptions
            }
        }

        return this
    }
    public fun setOptions(defaultPic : Int, erroPic : Int, isCache : Boolean):GlidepalUtil{
        var requestoptions: RequestOptions?
            requestoptions = RequestOptions()
                    .placeholder(defaultPic)
                    .error(erroPic)
                    .skipMemoryCache(isCache)

        requestOptions = requestoptions

        return this
    }

    public fun glideLoad(context: Context, url :String, imageView: ImageView){
            Glide.with(context).load(url).apply(requestOptions!!).into(imageView)

    }
    public fun glideLoad(context: Context, url :Int, imageView: ImageView){
        Glide.with(context).load(url).apply(requestOptions!!).into(imageView)

    }

    /*
    * @author
    * @doc annotation
    * @add yours
    *
    * just simple use!
    * @FOR THE DOWN
    */
    public fun simpleLoad(context: Context, url :String, imageView: ImageView){
        Glide.with(context).load(url).into(imageView)
    }

    public fun simpleLoad(context: Context, drawableSource :Int, imageView: ImageView){
        Glide.with(context).load(drawableSource).into(imageView)
    }



}


