package ${packageName}.impl;

import ${packageName}.imp.${iPName};
import ${packageName}.imp.${iVName};
import ${packageName}.impl.${mName};
import ${applicationPackage}.base.BaseMvpPresenter;

class ${pName} extends BaseMvpPresenter<${iVName}> implements ${iPName}{

    private ${mName} m${mName} = null;

    public ${pName}(){
	
		m${mName} = new ${mName}();
	
	}
}