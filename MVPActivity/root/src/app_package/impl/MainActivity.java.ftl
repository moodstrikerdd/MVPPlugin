package ${packageName}.impl;

<#if applicationPackage??>
import ${applicationPackage}.R;
import ${applicationPackage}.base.BaseActivity;
import ${packageName}.imp.${iVName};
import android.view.View;
</#if>

public class ${activityClass} extends BaseActivity<${iVName}, ${pName}> implements ${iVName} {
	
	@Override
    protected int getLayoutId() {
        return R.layout.${activityToLayout(activityClass)};
    }

    @Override
    protected ${pName} getPresenter() {
        return new ${pName}();
    }
	
	private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                default:
                    break;
            }
        }
    };

    @Override
    protected void initView() {

    }
	
	
}
