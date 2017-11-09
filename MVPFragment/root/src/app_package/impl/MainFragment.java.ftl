package ${packageName}.impl;

<#if applicationPackage??>
import ${applicationPackage}.R;
import android.os.Bundle;
import ${applicationPackage}.base.BaseFragment;
import ${packageName}.imp.${iVName};
</#if>

class ${fragmentClass} extends BaseFragment<${iVName}, ${pName}> implements ${iVName} {

	private static final String ARG_PARAM1 = "param1";
	
    private String mParam1;

    public static ${fragmentClass} newInstance(String param1) {
        ${fragmentClass} fragment = new ${fragmentClass}();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }
	
}
