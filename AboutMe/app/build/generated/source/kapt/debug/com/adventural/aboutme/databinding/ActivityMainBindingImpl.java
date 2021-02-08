package com.adventural.aboutme.databinding;
import com.adventural.aboutme.R;
import com.adventural.aboutme.BR;
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
        sViewsWithIds.put(R.id.done_button, 4);
        sViewsWithIds.put(R.id.imageView, 5);
        sViewsWithIds.put(R.id.bio_scroll, 6);
        sViewsWithIds.put(R.id.bio_text, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ScrollView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.Button) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameText.setTag(null);
        this.nicknameEdit.setTag(null);
        this.nicknameText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.MyName == variableId) {
            setMyName((com.adventural.aboutme.entitiy.MyName) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyName(@Nullable com.adventural.aboutme.entitiy.MyName MyName) {
        this.mMyName = MyName;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.MyName);
        super.requestRebind();
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
        com.adventural.aboutme.entitiy.MyName myName = mMyName;
        java.lang.String myNameNickname = null;
        java.lang.String myNameName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (myName != null) {
                    // read MyName.nickname
                    myNameNickname = myName.getNickname();
                    // read MyName.name
                    myNameName = myName.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameText, myNameName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nicknameEdit, myNameNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nicknameText, myNameNickname);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): MyName
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}