export function makeUpJs(list) {
  const models = list.map(item => item.model).filter(Boolean)
  
  let js = 'export default {\n  name: \'FormGenerator\',\n  data() {\n    return {\n      form: {\n'
  
  models.forEach(model => {
    js += `        ${model}: '',\n`
  })
  
  js += '      },\n      rules: {\n'
  
  list.forEach(item => {
    if (item.model && item.required) {
      js += `        ${item.model}: [\n          { required: true, message: '请输入${item.label}', trigger: 'blur' }\n        ],\n`
    }
  })
  
  js += '      }\n    }\n  },\n  methods: {\n    submitForm() {\n      this.$refs.form.validate((valid) => {\n        if (valid) {\n          this.$message.success(\'提交成功\')\n        }\n      })\n    },\n    resetForm() {\n      this.$refs.form.resetFields()\n    }\n  }\n}'
  
  return js
}
