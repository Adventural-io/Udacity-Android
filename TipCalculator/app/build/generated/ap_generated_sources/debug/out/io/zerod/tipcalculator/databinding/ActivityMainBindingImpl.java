package io.zerod.tipcalculator.databinding;
import io.zerod.tipcalculator.R;
import io.zerod.tipcalculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 1);
        sViewsWithIds.put(R.id.imageView2, 2);
        sViewsWithIds.put(R.id.costOfServiceTextInputLayout, 3);
        sViewsWithIds.put(R.id.costOfServiceEditText, 4);
        sViewsWithIds.put(R.id.howWasTheServiceText, 5);
        sViewsWithIds.put(R.id.serviceRatingRadioGroup, 6);
        sViewsWithIds.put(R.id.amazingRadioButton, 7);
        sViewsWithIds.put(R.id.goodRadioButton, 8);
        sViewsWithIds.put(R.id.okRadioButton, 9);
        sViewsWithIds.put(R.id.icon_round_up, 10);
        sViewsWithIds.put(R.id.roundUpSwitch, 11);
        sViewsWithIds.put(R.id.calculateButton, 12);
        sViewsWithIds.put(R.id.tipAmountText, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.Button) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (android.widget.RadioButton) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RadioButton) bindings[9]
            , (com.google.android.material.switchmaterial.SwitchMaterial) bindings[11]
            , (android.widget.RadioGroup) bindings[6]
            , (android.widget.TextView) bindings[13]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}