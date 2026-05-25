export function makeUpHtml(list) {
  let html = ''
  list.forEach(item => {
    html += getComponentHtml(item)
  })
  return html
}

function getComponentHtml(item) {
  const { tag, options = {}, children = [] } = item
  
  let props = ''
  for (const key in options) {
    if (key === 'type' && options[key] === 'textarea') {
      continue
    }
    props += ` ${key}="${options[key]}"`
  }
  
  if (item.model) {
    props += ` v-model="form.${item.model}"`
  }
  
  let childHtml = ''
  if (children.length > 0) {
    children.forEach(child => {
      const childTag = child.tag
      let childProps = ''
      for (const key in child.props) {
        childProps += ` ${key}="${child.props[key]}"`
      }
      childHtml += `<${childTag}${childProps}></${childTag}>`
    })
  }
  
  if (tag === 'el-input' && options.type === 'textarea') {
    return `    <el-form-item label="${item.label}" prop="${item.model}">\n      <el-input type="textarea"${props}></el-input>\n    </el-form-item>\n`
  }
  
  return `    <el-form-item label="${item.label}" prop="${item.model}">\n      <${tag}${props}>${childHtml}</${tag}>\n    </el-form-item>\n`
}

export function vueTemplate(list, formConf) {
  const { labelWidth, labelPosition, size } = formConf
  
  let template = `<template>\n  <el-form :model="form" :label-width="${labelWidth}" label-position="${labelPosition}" size="${size}">\n`
  template += makeUpHtml(list)
  template += '    <el-form-item>\n      <el-button type="primary" @click="submitForm">提交</el-button>\n      <el-button @click="resetForm">重置</el-button>\n    </el-form-item>\n  </el-form>\n</template>'
  
  return template
}

export function vueScript(list) {
  const models = list.map(item => item.model).filter(Boolean)
  
  let script = '<script>\nexport default {\n  name: \'FormGenerator\',\n  data() {\n    return {\n      form: {\n'
  
  models.forEach(model => {
    script += `        ${model}: '',\n`
  })
  
  script += '      },\n      rules: {\n'
  
  list.forEach(item => {
    if (item.model && item.required) {
      script += `        ${item.model}: [\n          { required: true, message: '请输入${item.label}', trigger: 'blur' }\n        ],\n`
    }
  })
  
  script += '      }\n    }\n  },\n  methods: {\n    submitForm() {\n      this.$refs.form.validate((valid) => {\n        if (valid) {\n          this.$message.success(\'提交成功\')\n        }\n      })\n    },\n    resetForm() {\n      this.$refs.form.resetFields()\n    }\n  }\n}\n</script>'
  
  return script
}

export function cssStyle() {
  return '<style scoped>\n</style>'
}
