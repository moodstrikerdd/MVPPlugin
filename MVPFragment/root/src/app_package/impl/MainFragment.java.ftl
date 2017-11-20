package ${packageName}.impl;

<#if applicationPackage??>
import ${applicationPackage}.R;
import android.os.Bundle;
import ${applicationPackage}.base.BaseFragment;
import ${packageName}.imp.${iVName};
import android.view.View;
</#if>

public class ${fragmentClass} extends BaseFragment<${iVName}, ${pName}> implements ${iVName} {

    public static ${fragmentClass} newInstance() {
        ${fragmentClass} fragment = new ${fragmentClass}();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
	
	@Override
    protected int getLayoutId() {
        return R.layout.fragment_${classToResource(mvpName)};
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
