let drawingDefaultValue = {}

export function initDrawingDefaultValue() {
  drawingDefaultValue = {
    form: {
      labelWidth: '120px',
      labelPosition: 'right',
      size: 'medium'
    },
    fields: []
  }
}

export function cleanDrawingDefaultValue() {
  drawingDefaultValue = {}
}

export { drawingDefaultValue }
