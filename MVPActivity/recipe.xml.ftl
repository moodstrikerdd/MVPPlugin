<?xml version="1.0"?>
<recipe>

    <merge from="root/AndroidManifest.xml.ftl"
             to="${escapeXmlAttribute(manifestOut)}/AndroidManifest.xml" />

    <instantiate from="root/res/layout/activity_main.xml.ftl"
                   to="${escapeXmlAttribute(resOut)}/layout/${layoutName}.xml" />

    <instantiate from="root/src/app_package/imp/IMainModel.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/imp/${iMName}.java" />
				   
    <instantiate from="root/src/app_package/imp/IMainPresenter.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/imp/${iPName}.java" />
				   
    <instantiate from="root/src/app_package/imp/IMainView.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/imp/${iVName}.java" />

    <instantiate from="root/src/app_package/impl/MainActivity.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/impl/${activityClass}.java" />
				   
    <instantiate from="root/src/app_package/impl/MainModel.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/impl/${mName}.java" />
				   
    <instantiate from="root/src/app_package/impl/MainPresenter.java.ftl"
                   to="${escapeXmlAttribute(srcOut)}/impl/${pName}.java" />

    <open file="${escapeXmlAttribute(srcOut)}/impl/${activityClass}.java" />
</recipe>
