import pytest
from math_utils import MathUtils

math = MathUtils()

def test_add():
    assert math.add(2, 3) == 5

def test_subtract():
    assert math.subtract(5, 3) == 2

def test_multiply():
    assert math.multiply(4, 2) == 8

def test_divide():
    assert math.divide(10, 2) == 5
    assert math.divide(10, 0) == -1.0