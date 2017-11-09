package ${packageName}.impl;

<#if applicationPackage??>
import ${applicationPackage}.R;
import ${applicationPackage}.base.BaseActivity;
import ${packageName}.imp.${iVName};
</#if>

class ${activityClass} extends BaseActivity<${iVName}, ${pName}> implements ${iVName} {

	
}
