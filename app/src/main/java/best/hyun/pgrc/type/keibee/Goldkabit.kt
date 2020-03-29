package best.hyun.pgrc.type.keibee

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Goldkabit : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_goldkabit)
    override val type: PET_TYPE
        get() = PET_TYPE.KEIBEE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_goldkabit)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 32
    override val initLvMaxAtk: Int
        get() = 6
    override val initLvMaxDef: Int
        get() = 5
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1269
    override val maxLvMaxAtk: Int
        get() = 239
    override val maxLvMaxDef: Int
        get() = 211
    override val maxLvMaxSpd: Int
        get() = 257
    override val initLvMinHp: Int
        get() = 22
    override val initLvMinAtk: Int
        get() = 4
    override val initLvMinDef: Int
        get() = 3
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1030
    override val maxLvMinAtk: Int
        get() = 196
    override val maxLvMinDef: Int
        get() = 167
    override val maxLvMinSpd: Int
        get() = 222
    override val minAllGrowth: Double
        get() = 4.161
    override val maxAllGrowth: Double
        get() = 4.980
}