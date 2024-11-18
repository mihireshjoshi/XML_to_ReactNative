import React from 'react';
import { View, Text, TextInput, TouchableOpacity } from 'react-native';

export default function FormRenderer({ json }) {
  const renderField = (field) => {
    switch (field.attributes.type) {
      case 'text':
        return (
          <View key={field.attributes.label}>
            <Text>{field.attributes.label}</Text>
            <TextInput style={{ borderWidth: 1, marginBottom: 10 }} />
          </View>
        );
      case 'date':
        return (
          <View key={field.attributes.label}>
            <Text>{field.attributes.label}</Text>
            <TextInput placeholder="Pick a date" style={{ borderWidth: 1, marginBottom: 10 }} />
          </View>
        );
      case 'radio':
        return (
          <View key={field.attributes.label}>
            <Text>{field.attributes.label}</Text>
            {field.children.map((option, index) => (
              <TouchableOpacity key={index}>
                <Text>{option.value}</Text>
              </TouchableOpacity>
            ))}
          </View>
        );
      case 'drawing':
        return (
          <View key={field.attributes.label}>
            <Text>{field.attributes.label}</Text>
            <TouchableOpacity>
              <Text>Open Drawing Canvas</Text>
            </TouchableOpacity>
          </View>
        );
      default:
        return null;
    }
  };

  return <View>{json?.children?.map(renderField)}</View>;
}
