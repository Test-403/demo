export const inputComponents = [
  {
    label: '单行文本',
    tag: 'el-input',
    icon: 'el-icon-edit',
    options: {
      placeholder: '请输入',
      clearable: true,
      showPassword: false
    }
  },
  {
    label: '多行文本',
    tag: 'el-input',
    icon: 'el-icon-file-text',
    options: {
      type: 'textarea',
      placeholder: '请输入',
      rows: 4
    }
  },
  {
    label: '数字输入',
    tag: 'el-input-number',
    icon: 'el-icon-calculator',
    options: {
      placeholder: '请输入数字',
      min: 0,
      max: 99999
    }
  },
  {
    label: '密码输入',
    tag: 'el-input',
    icon: 'el-icon-lock',
    options: {
      type: 'password',
      placeholder: '请输入密码',
      showPassword: true
    }
  }
]

export const selectComponents = [
  {
    label: '下拉选择',
    tag: 'el-select',
    icon: 'el-icon-arrow-down',
    options: {
      placeholder: '请选择',
      clearable: true
    },
    children: [
      { tag: 'el-option', props: { label: '选项一', value: '1' } },
      { tag: 'el-option', props: { label: '选项二', value: '2' } }
    ]
  },
  {
    label: '级联选择',
    tag: 'el-cascader',
    icon: 'el-icon-refresh',
    options: {
      placeholder: '请选择',
      clearable: true
    }
  },
  {
    label: '日期选择',
    tag: 'el-date-picker',
    icon: 'el-icon-calendar',
    options: {
      type: 'date',
      placeholder: '请选择日期'
    }
  },
  {
    label: '时间选择',
    tag: 'el-time-picker',
    icon: 'el-icon-clock',
    options: {
      placeholder: '请选择时间'
    }
  },
  {
    label: '日期时间',
    tag: 'el-date-picker',
    icon: 'el-icon-calendar-check',
    options: {
      type: 'datetime',
      placeholder: '请选择日期时间'
    }
  },
  {
    label: '开关',
    tag: 'el-switch',
    icon: 'el-icon-toggle-left',
    options: {
      activeText: '开启',
      inactiveText: '关闭'
    }
  },
  {
    label: '单选框组',
    tag: 'el-radio-group',
    icon: 'el-icon-circle',
    options: {},
    children: [
      { tag: 'el-radio', props: { label: '选项一', value: '1' } },
      { tag: 'el-radio', props: { label: '选项二', value: '2' } }
    ]
  },
  {
    label: '复选框组',
    tag: 'el-checkbox-group',
    icon: 'el-icon-check-square',
    options: {},
    children: [
      { tag: 'el-checkbox', props: { label: '选项一', value: '1' } },
      { tag: 'el-checkbox', props: { label: '选项二', value: '2' } }
    ]
  }
]

export const layoutComponents = [
  {
    label: '分割线',
    tag: 'el-divider',
    icon: 'el-icon-minus'
  },
  {
    label: '说明文字',
    tag: 'span',
    icon: 'el-icon-info',
    options: {
      style: 'color:#909399;font-size:13px'
    }
  }
]

export const formConf = {
  labelWidth: '120px',
  labelPosition: 'right',
  size: 'medium'
}
