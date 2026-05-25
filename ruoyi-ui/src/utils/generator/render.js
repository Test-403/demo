export default {
  props: ['config', 'value'],
  render(h) {
    const tag = this.config.tag || 'input'
    const listeners = {}
    const on = this.config.on || {}
    
    for (const key in on) {
      listeners[key] = (...args) => {
        this.$emit(key, ...args)
      }
    }
    
    listeners.input = (event) => {
      this.$emit('input', event.target.value)
    }
    
    const props = {
      ...this.config,
      value: this.value,
      on: listeners
    }
    
    delete props.tag
    delete props.on
    delete props.options
    delete props.children
    
    return h(tag, props, this.config.children ? this.config.children : [])
  }
}
